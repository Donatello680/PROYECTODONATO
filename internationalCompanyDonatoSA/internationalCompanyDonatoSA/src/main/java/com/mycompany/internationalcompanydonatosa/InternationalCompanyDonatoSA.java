
package com.mycompany.internationalcompanydonatosa;

import javax.swing.*;

// *****************************************************************************
// Clase Principal: Punto de entrada de la aplicación.
// Esta clase contiene el método main, que se ejecuta al iniciar el programa.
public class InternationalCompanyDonatoSA {

    // -------------------------------------------------------------------------
    // Método main: punto inicial de ejecución en un programa Java.
    // Los parámetros (String[] args) permiten recibir argumentos desde la línea de comandos.
    public static void main(String[] args) {
        // SwingUtilities.invokeLater se utiliza para asegurar que la creación y manipulación
        // de componentes GUI se realice en el hilo de eventos de Swing (Event Dispatch Thread).
        // Esto es necesario para evitar problemas de concurrencia y para que la interfaz responda
        // correctamente.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            // Método run: se ejecuta en el hilo de Swing.
            public void run() {
                // Se crea una instancia de la clase MainMenu, la cual es la ventana principal
                // que contiene todos los botones y opciones para navegar por el sistema.
                new MainMenu();
            }
        });
    }
}

// *****************************************************************************
// Clase MainMenu: Define la ventana principal de la aplicación.
// Se extiende JFrame para crear una ventana que contenga otros componentes gráficos.
class MainMenu extends JFrame {
    
    // Declaración de botones para diferentes funcionalidades del programa.
    // Cada botón se utilizará para abrir una vista o realizar una acción.
    private JButton btnParqueo, btnSalasReuniones, btnCubiculos, btnAuditorio, btnRecreativos;
    private JButton btnAsignarReserva, btnListarReservas, btnLiberarReserva;
    private JButton btnGestionEmpleados, btnSalir;
    
    // -------------------------------------------------------------------------
    // Constructor de MainMenu: Se ejecuta al crear un objeto de MainMenu.
    public MainMenu() {
        // setTitle: establece el título de la ventana.
        setTitle("International Company DonatoSA - Sistema de Reservas");
        // setSize: define el tamaño de la ventana en píxeles (ancho 850 x alto 500).
        setSize(850, 500);
        // setLocationRelativeTo(null): centra la ventana en la pantalla.
        setLocationRelativeTo(null);
        // setDefaultCloseOperation: define qué ocurrirá al cerrar la ventana.
        // EXIT_ON_CLOSE indica que el programa finalizará.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Se crea un JPanel (panel contenedor) que ayudará a organizar los botones.
        JPanel panel = new JPanel();
        // Se establece el administrador de diseños (layout) como BoxLayout,
        // con orientación vertical (Y_AXIS) para apilar los botones uno debajo del otro.
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // ---------------------------------------------------------------------
        // Botón para visualizar parqueos.
        btnParqueo = new JButton("Visualizar Parqueos");
        // Centra el botón horizontalmente en su contenedor.
        btnParqueo.setAlignmentX(CENTER_ALIGNMENT);
        // Se añade un listener para capturar el evento de clic en el botón.
        btnParqueo.addActionListener(new java.awt.event.ActionListener() {
            // Método que se ejecuta al hacer clic.
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // Al hacer clic se crea una nueva instancia de ParkingView
                // que abrirá la ventana de visualización de parqueos.
                new ParkingView();
            }
        });
        // Se agrega el botón al panel.
        panel.add(btnParqueo);
        // Se añade un espacio vertical de 10 píxeles para separar visualmente los componentes.
        panel.add(Box.createVerticalStrut(10));

        // ---------------------------------------------------------------------
        // Botón para visualizar salas de reuniones.
        btnSalasReuniones = new JButton("Visualizar Salas de Reuniones");
        btnSalasReuniones.setAlignmentX(CENTER_ALIGNMENT);
        btnSalasReuniones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // Abre la ventana para ver las salas de reuniones.
                new MeetingRoomsView();
            }
        });
        panel.add(btnSalasReuniones);
        panel.add(Box.createVerticalStrut(10));

        // ---------------------------------------------------------------------
        // Botón para visualizar cubículos.
        btnCubiculos = new JButton("Visualizar Cubículos");
        btnCubiculos.setAlignmentX(CENTER_ALIGNMENT);
        btnCubiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // Abre la ventana de visualización de cubículos.
                new CubiclesView();
            }
        });
        panel.add(btnCubiculos);
        panel.add(Box.createVerticalStrut(10));

        // ---------------------------------------------------------------------
        // Botón para visualizar auditorio.
        btnAuditorio = new JButton("Visualizar Auditorio");
        btnAuditorio.setAlignmentX(CENTER_ALIGNMENT);
        btnAuditorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // Abre la ventana de visualización del auditorio.
                new AuditoriumView();
            }
        });
        panel.add(btnAuditorio);
        panel.add(Box.createVerticalStrut(10));

        // ---------------------------------------------------------------------
        // Botón para visualizar espacios recreativos.
        btnRecreativos = new JButton("Visualizar Espacios Recreativos");
        btnRecreativos.setAlignmentX(CENTER_ALIGNMENT);
        btnRecreativos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // Abre la ventana de visualización de espacios recreativos.
                new RecreationView();
            }
        });
        panel.add(btnRecreativos);
        panel.add(Box.createVerticalStrut(10));

        // ---------------------------------------------------------------------
        // Botón para asignar una reserva.
        btnAsignarReserva = new JButton("Asignar Reserva");
        btnAsignarReserva.setAlignmentX(CENTER_ALIGNMENT);
        btnAsignarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // Llama al método interno asignarReserva para iniciar el proceso.
                asignarReserva();
            }
        });
        panel.add(btnAsignarReserva);
        panel.add(Box.createVerticalStrut(10));

        // ---------------------------------------------------------------------
        // Botón para listar las reservas ya asignadas.
        btnListarReservas = new JButton("Listar Reservas");
        btnListarReservas.setAlignmentX(CENTER_ALIGNMENT);
        btnListarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // Abre la ventana que muestra la lista de reservas.
                new ReservationsView();
            }
        });
        panel.add(btnListarReservas);
        panel.add(Box.createVerticalStrut(10));

        // ---------------------------------------------------------------------
        // Botón para liberar una reserva.
        btnLiberarReserva = new JButton("Liberar Reserva");
        btnLiberarReserva.setAlignmentX(CENTER_ALIGNMENT);
        btnLiberarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // Llama al método liberarReserva para eliminar una reserva.
                liberarReserva();
            }
        });
        panel.add(btnLiberarReserva);
        panel.add(Box.createVerticalStrut(10));

        // ---------------------------------------------------------------------
        // Botón para gestionar empleados.
        btnGestionEmpleados = new JButton("Gestión de Empleados");
        btnGestionEmpleados.setAlignmentX(CENTER_ALIGNMENT);
        btnGestionEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // Abre la ventana para gestión de empleados (listar y registrar).
                new EmployeeManagementView();
            }
        });
        panel.add(btnGestionEmpleados);
        panel.add(Box.createVerticalStrut(10));

        // ---------------------------------------------------------------------
        // Botón para salir del programa.
        btnSalir = new JButton("Salir");
        btnSalir.setAlignmentX(CENTER_ALIGNMENT);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // System.exit(0) finaliza la aplicación.
                System.exit(0);
            }
        });
        panel.add(btnSalir);

        // Se añade el panel principal al contenedor de la ventana.
        getContentPane().add(panel);
        // Hace visible la ventana en la pantalla.
        setVisible(true);
    }
    
    // -------------------------------------------------------------------------
    // Método para asignar una reserva. Utiliza diálogos para interactuar con el usuario.
    private void asignarReserva() {
        try {
            // Se solicita al usuario que ingrese el ID del empleado mediante un cuadro de diálogo.
            String idStr = JOptionPane.showInputDialog(this, "Ingrese el ID del empleado:");
            // Si el usuario cancela, se finaliza el método.
            if (idStr == null) return;
            // Se convierte el ID ingresado (String) a un entero.
            int id = Integer.parseInt(idStr);
            // Se busca el nombre del empleado mediante el catálogo (ver clase EmployeeCatalog).
            String nombre = EmployeeCatalog.getNameByID(id);
            // Si el empleado no existe (nombre es una cadena vacía)
            if (nombre.equals("")) {
                // Se pregunta mediante un cuadro de confirmación si se desea registrar al empleado.
                int opcion = JOptionPane.showConfirmDialog(this,
                        "El empleado no se encuentra registrado. ¿Desea registrarlo?",
                        "Registro de Empleado", JOptionPane.YES_NO_OPTION);
                // Si el usuario acepta registrar el empleado:
                if (opcion == JOptionPane.YES_OPTION) {
                    // Se solicita el nombre del empleado.
                    String newName = JOptionPane.showInputDialog(this, "Ingrese el nombre del empleado:");
                    // Si el nombre ingresado es nulo o vacío, se muestra mensaje de error.
                    if (newName == null || newName.trim().equals("")) {
                        JOptionPane.showMessageDialog(this, "Nombre inválido.");
                        return;
                    }
                    // Se añade el empleado al catálogo.
                    boolean registrado = EmployeeCatalog.addEmployee(new Employee(id, newName));
                    if (registrado) {
                        // Si se registró exitosamente, se asigna el nuevo nombre.
                        nombre = newName;
                        JOptionPane.showMessageDialog(this, "Empleado registrado exitosamente.");
                    } else {
                        // Si falla el registro (por límite alcanzado u otro error), se notifica.
                        JOptionPane.showMessageDialog(this, "No se pudo registrar el empleado (límite alcanzado o error).");
                        return;
                    }
                } else {
                    // Si el usuario no desea registrar, se termina el método.
                    return;
                }
            }
            // Se definen las opciones de reserva para elegir.
            String[] opciones = {"Parqueo", "Sala de Reuniones", "Cubículo", "Auditorio", "Espacios Recreativos"};
            // Se solicita al usuario seleccionar el tipo de reserva de una lista desplegable.
            String tipo = (String) JOptionPane.showInputDialog(this, "Seleccione el tipo de reserva:",
                    "Tipo de Reserva", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if (tipo == null) return;
            // Se solicita al usuario ingresar un detalle adicional de la reserva (por ejemplo, número de espacio).
            String detalle = JOptionPane.showInputDialog(this, "Ingrese detalle (Ej. Nº de espacio, turno, etc):");
            if (detalle == null) return;
            
            // Se crea un objeto Reservation con los datos ingresados.
            Reservation r = new Reservation(id, nombre, tipo, detalle);
            // Se añade la reserva al gestor de reservas.
            ReservationsManager.addReservation(r);
            // Se muestra un mensaje confirmando la asignación de la reserva.
            JOptionPane.showMessageDialog(this, "Reserva asignada a " + nombre + " (" + tipo + ").");
        } catch (Exception ex) {
            // En caso de error (por ejemplo, al convertir el ID), se muestra un mensaje de error.
            JOptionPane.showMessageDialog(this, "Error en la asignación de reserva. Revise los datos ingresados.");
        }
    }
    
    // -------------------------------------------------------------------------
    // Método para liberar una reserva existente.
    private void liberarReserva() {
        try {
            // Se solicita al usuario ingresar el índice (posición en el arreglo) de la reserva a liberar.
            String indexStr = JOptionPane.showInputDialog(this, "Ingrese el índice de la reserva a liberar (comienza en 0):");
            if (indexStr == null) return;
            // Se convierte el índice de String a entero.
            int index = Integer.parseInt(indexStr);
            // Se llama al método liberarReserva del ReservationsManager para eliminar la reserva.
            if (ReservationsManager.liberarReserva(index))
                JOptionPane.showMessageDialog(this, "Reserva liberada.");
            else
                JOptionPane.showMessageDialog(this, "Índice inválido.");
        } catch (Exception ex) {
            // Se captura cualquier excepción y se informa al usuario.
            JOptionPane.showMessageDialog(this, "Error al liberar reserva.");
        }
    }
}

// *****************************************************************************
// MÓDULOS DE VISUALIZACIÓN (Interfaz Gráfica para Diferentes Áreas)
// Las siguientes clases crean ventanas específicas para mostrar la información
// de parqueos, salas de reuniones, cubículos, auditorio y espacios recreativos.

// -----------------------------------------------------------------------------
// Clase ParkingView: Ventana para visualizar los parqueos en diferentes niveles.
// Se basa en matrices bidimensionales que representan la distribución de espacios.
class ParkingView extends JFrame {
    // Matrices que representan el estado de cada nivel del parqueo.
    // Cada carácter indica el estado o tipo de espacio:
    // 'P' => Reservado/Ocupado, 'O' => Libre, 'D' y 'E' pueden ser especiales.
    private char[][] levelS1 = {
        {'D', 'P', 'O', 'O', 'P'},
        {'O', 'O', 'O', 'O', 'O'},
        {'O', 'P', 'O', 'O', 'O'},
        {'E', 'E', 'E', 'O', 'D'}
    };
    private char[][] levelS2 = {
        {'P', 'P', 'O', 'O', 'P'},
        {'O', 'D', 'O', 'O', 'O'},
        {'O', 'P', 'O', 'O', 'O'},
        {'O', 'O', 'O', 'O', 'P'},
        {'E', 'E', 'E', 'E', 'P'}
    };
    private char[][] levelS3 = {
        {'P', 'P', 'O', 'O', 'P'},
        {'O', 'O', 'O', 'O', 'O'},
        {'O', 'P', 'O', 'O', 'O'},
        {'O', 'O', 'O', 'O', 'P'},
        {'P', 'P', 'D', 'P', 'P'},
        {'E', 'E', 'E', 'O', 'D'}
    };
    
    // -------------------------------------------------------------------------
    // Constructor de ParkingView: Configura la ventana y sus componentes.
    public ParkingView() {
        setTitle("Visualización de Parqueos");
        setSize(800, 600);
        setLocationRelativeTo(null);
        // DISPOSE_ON_CLOSE: Cierra solo esta ventana sin terminar toda la aplicación.
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // JTabbedPane permite organizar contenido en pestañas.
        JTabbedPane tabbedPane = new JTabbedPane();
        // Cada pestaña muestra un nivel del parqueo usando un ParkingPanel.
        tabbedPane.add("Nivel S1", new ParkingPanel(levelS1));
        tabbedPane.add("Nivel S2", new ParkingPanel(levelS2));
        tabbedPane.add("Nivel S3", new ParkingPanel(levelS3));
        // Se añade el panel de pestañas al contenedor de la ventana.
        getContentPane().add(tabbedPane);
        setVisible(true);
    }
}

// -----------------------------------------------------------------------------
// Clase ParkingPanel: Panel que muestra una matriz de parqueo en forma de tabla.
// Se utiliza GridLayout para organizar los elementos en una cuadrícula.
class ParkingPanel extends JPanel {
    
    // Constructor: recibe una matriz que representa el nivel de parqueo.
    public ParkingPanel(char[][] level) {
        // Se crea un panel "grid" que usará GridLayout.
        // Se suma 1 tanto a filas como columnas para incluir encabezados (letras y números).
        JPanel grid = new JPanel();
        grid.setLayout(new java.awt.GridLayout(level.length + 1, level[0].length + 1, 5, 5));
        
        // Se agrega una celda vacía en la esquina superior izquierda (para los encabezados).
        grid.add(new JLabel(" "));
        // Se agregan encabezados de columna (números).
        for (int col = 0; col < level[0].length; col++) {
            JLabel label = new JLabel(String.valueOf(col + 1), SwingConstants.CENTER);
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 12));
            grid.add(label);
        }
        // Se recorre cada fila de la matriz.
        for (int i = 0; i < level.length; i++) {
            // Encabezado de fila: se utiliza una letra (A, B, C, …).
            JLabel labelRow = new JLabel(Character.toString((char)('A' + i)), SwingConstants.CENTER);
            labelRow.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 12));
            grid.add(labelRow);
            // Se recorre cada celda de la fila.
            for (int j = 0; j < level[i].length; j++) {
                // Se crea un JLabel que muestra el estado de la celda (carácter).
                JLabel cell = new JLabel(String.valueOf(level[i][j]), SwingConstants.CENTER);
                // Se añade un borde para delimitar la celda.
                cell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                // Según el estado (carácter), se define un color de fondo.
                if (level[i][j] == 'P')
                    cell.setBackground(new java.awt.Color(255, 0, 0)); // Rojo
                else if (level[i][j] == 'O')
                    cell.setBackground(new java.awt.Color(0, 255, 0)); // Verde
                else if (level[i][j] == 'D')
                    cell.setBackground(new java.awt.Color(0, 255, 255)); // Cian
                else if (level[i][j] == 'E')
                    cell.setBackground(new java.awt.Color(255, 165, 0)); // Naranja
                // setOpaque(true) es necesario para que el color de fondo se muestre.
                cell.setOpaque(true);
                // Se añade la celda al grid.
                grid.add(cell);
            }
        }
        // Se añade el grid al panel principal.
        add(grid);
    }
}

// -----------------------------------------------------------------------------
// Clase MeetingRoomsView: Ventana para visualizar salas de reuniones.
// Organiza las salas en pestañas, cada una con un panel que muestra su disposición.
class MeetingRoomsView extends JFrame {
    public MeetingRoomsView() {
        setTitle("Visualización de Salas de Reuniones");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JTabbedPane tabbedPane = new JTabbedPane();
        // Se crean distintas salas utilizando MeetingRoomPanel, especificando filas y columnas.
        tabbedPane.add("Sala 5", new MeetingRoomPanel(1, 5));
        tabbedPane.add("Sala 10", new MeetingRoomPanel(2, 5));
        tabbedPane.add("Sala 15", new MeetingRoomPanel(3, 5));
        tabbedPane.add("Sala 20", new MeetingRoomPanel(4, 5));
        getContentPane().add(tabbedPane);
        setVisible(true);
    }
}

// -----------------------------------------------------------------------------
// Clase MeetingRoomPanel: Panel para mostrar la disposición de una sala de reuniones.
// Utiliza una matriz para representar los asientos o espacios y GridLayout para organizarlos.
class MeetingRoomPanel extends JPanel {
    private char[][] room;
    
    // Constructor: crea la matriz de la sala en función del número de filas y columnas.
    public MeetingRoomPanel(int filas, int columnas) {
        room = new char[filas][columnas];
        // Inicializa todas las celdas como 'O' (disponible).
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                room[i][j] = 'O';
            }
        }
        // Si la sala tiene más de 3 celdas, se marca la primera celda como 'P' (por ejemplo, ocupado).
        if (filas * columnas > 3)
            room[0][0] = 'P';
        // Se crea un panel grid similar al de ParkingPanel para mostrar la sala.
        JPanel grid = new JPanel();
        grid.setLayout(new java.awt.GridLayout(filas + 1, columnas + 1, 5, 5));
        // Se añade celda vacía para los encabezados.
        grid.add(new JLabel(" "));
        // Encabezados de columnas.
        for (int col = 0; col < columnas; col++) {
            JLabel label = new JLabel(String.valueOf(col + 1), SwingConstants.CENTER);
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 12));
            grid.add(label);
        }
        // Se crean filas con encabezado (letras) y celdas para cada posición.
        for (int i = 0; i < filas; i++) {
            JLabel labelRow = new JLabel(Character.toString((char)('A' + i)), SwingConstants.CENTER);
            labelRow.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 12));
            grid.add(labelRow);
            for (int j = 0; j < columnas; j++) {
                JLabel cell = new JLabel(String.valueOf(room[i][j]), SwingConstants.CENTER);
                cell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                // Si la celda está ocupada ('P'), se muestra en rojo, si no, en verde.
                if (room[i][j] == 'P')
                    cell.setBackground(new java.awt.Color(255, 0, 0));
                else
                    cell.setBackground(new java.awt.Color(0, 255, 0));
                cell.setOpaque(true);
                grid.add(cell);
            }
        }
        add(grid);
    }
}

// -----------------------------------------------------------------------------
// Clase CubiclesView: Ventana para visualizar cubículos insonorizados.
// Representa una matriz de 3 filas (cubículos) por 10 columnas (turnos de 9:00 a 18:00).
class CubiclesView extends JFrame {
    public CubiclesView() {
        setTitle("Visualización de Cubículos Insonorizados");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Se crea una matriz para los cubículos, cada posición representa un turno.
        char[][] cubicles = new char[3][10];
        // Se inicializa cada posición como 'O' (disponible).
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                cubicles[i][j] = 'O';
            }
        }
        // Se marca una posición específica como 'P' para indicar que está ocupado.
        cubicles[0][1] = 'P';
        // Se crea un panel grid con encabezados para filas y columnas.
        JPanel grid = new JPanel();
        grid.setLayout(new java.awt.GridLayout(3 + 1, 10 + 1, 5, 5));
        // Encabezado vacío en la esquina superior izquierda.
        grid.add(new JLabel(" "));
        // Se agregan encabezados de columna con las horas (de 9:00 en adelante).
        for (int j = 0; j < 10; j++) {
            JLabel label = new JLabel((9 + j) + ":00", SwingConstants.CENTER);
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 10));
            grid.add(label);
        }
        // Se agregan filas: cada fila representa un cubículo.
        for (int i = 0; i < 3; i++) {
            // Encabezado de fila con el número del cubículo.
            JLabel label = new JLabel("Cubículo " + (i + 1), SwingConstants.CENTER);
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 12));
            grid.add(label);
            // Se agregan las celdas correspondientes a los turnos.
            for (int j = 0; j < 10; j++) {
                JLabel cell = new JLabel(String.valueOf(cubicles[i][j]), SwingConstants.CENTER);
                cell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                if (cubicles[i][j] == 'P')
                    cell.setBackground(new java.awt.Color(255, 0, 0));
                else
                    cell.setBackground(new java.awt.Color(0, 255, 0));
                cell.setOpaque(true);
                grid.add(cell);
            }
        }
        // Se añade el grid al contenedor de la ventana.
        getContentPane().add(grid);
        setVisible(true);
    }
}

// -----------------------------------------------------------------------------
// Clase AuditoriumView: Ventana para visualizar el auditorio y gestionar reservas
// en dos sesiones (10:00 y 15:00) con capacidad máxima de 50 asistentes por sesión.
class AuditoriumView extends JFrame {
    // Variables para almacenar el número de reservas en cada sesión.
    private int session10 = 0;
    private int session15 = 0;
    
    public AuditoriumView() {
        setTitle("Visualización del Auditorio");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Se crea un panel principal con BoxLayout vertical.
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        // Etiqueta que muestra el estado de la sesión de las 10:00.
        JLabel lblSession10 = new JLabel("Sesión 10:00 (" + session10 + " / 50)");
        lblSession10.setAlignmentX(CENTER_ALIGNMENT);
        // Etiqueta que muestra el estado de la sesión de las 15:00.
        JLabel lblSession15 = new JLabel("Sesión 15:00 (" + session15 + " / 50)");
        lblSession15.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(lblSession10);
        panel.add(Box.createVerticalStrut(10));
        panel.add(lblSession15);
        panel.add(Box.createVerticalStrut(10));
        
        // Botón para reservar en la sesión de 10:00.
        JButton btnReservar10 = new JButton("Reservar en 10:00");
        btnReservar10.setAlignmentX(CENTER_ALIGNMENT);
        btnReservar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // Verifica que la sesión no esté completa.
                if (session10 < 50) {
                    session10++;
                    JOptionPane.showMessageDialog(null, "Asistente agregado para las 10:00.");
                } else {
                    JOptionPane.showMessageDialog(null, "Sesión de las 10:00 completa.");
                }
                // Se cierra la ventana actual y se crea una nueva para refrescar la información.
                dispose();
                new AuditoriumView();
            }
        });
        // Botón para reservar en la sesión de las 15:00, funcionamiento similar.
        JButton btnReservar15 = new JButton("Reservar en 15:00");
        btnReservar15.setAlignmentX(CENTER_ALIGNMENT);
        btnReservar15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (session15 < 50) {
                    session15++;
                    JOptionPane.showMessageDialog(null, "Asistente agregado para las 15:00.");
                } else {
                    JOptionPane.showMessageDialog(null, "Sesión de las 15:00 completa.");
                }
                dispose();
                new AuditoriumView();
            }
        });
        panel.add(btnReservar10);
        panel.add(Box.createVerticalStrut(10));
        panel.add(btnReservar15);
        
        getContentPane().add(panel);
        setVisible(true);
    }
}

// -----------------------------------------------------------------------------
// Clase RecreationView: Ventana para visualizar espacios recreativos.
// Utiliza pestañas para diferenciar las distintas actividades disponibles.
class RecreationView extends JFrame {
    public RecreationView() {
        setTitle("Espacios Recreativos");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JTabbedPane tabbedPane = new JTabbedPane();
        // Cada pestaña se crea con un RecreationPanel que recibe la actividad e información.
        tabbedPane.add("Ping-Pong & Billar", new RecreationPanel("Mesas", "Reserva en turnos de 30 min"));
        tabbedPane.add("Fútbol (2 canchas)", new RecreationPanel("Fútbol", "Capacidad 12 jugadores"));
        tabbedPane.add("Baloncesto (1 cancha)", new RecreationPanel("Baloncesto", "Capacidad 10"));
        tabbedPane.add("Tenis (2 canchas)", new RecreationPanel("Tenis", "Capacidad 2"));
        getContentPane().add(tabbedPane);
        setVisible(true);
    }
}

// -----------------------------------------------------------------------------
// Clase RecreationPanel: Panel que muestra información de una actividad recreativa.
// Se utiliza un JTextArea para mostrar información de solo lectura.
class RecreationPanel extends JPanel {
    public RecreationPanel(String actividad, String info) {
        // Se establece el layout vertical.
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        // Se crea un área de texto que muestra la actividad, información y disponibilidad.
        JTextArea area = new JTextArea("Actividad: " + actividad + "\n"
                + "Información: " + info + "\n"
                + "Disponibilidad: Reserva en turnos de 30 minutos.");
        // El área de texto no se puede editar.
        area.setEditable(false);
        add(area);
    }
}

// *****************************************************************************
// GESTIÓN DE RESERVAS Y EMPLEADOS
// En esta sección se administran las reservas y la información de los empleados.
// Se utilizan arreglos estáticos para almacenar los datos.

// -----------------------------------------------------------------------------
// Clase ReservationsManager: Gestiona las reservas mediante un arreglo.
// Permite agregar, listar y liberar reservas.
class ReservationsManager {
    // Arreglo estático para almacenar objetos Reservation (hasta 100 reservas).
    static Reservation[] reservations = new Reservation[100];
    // Contador que mantiene el número de reservas actuales.
    public static int count = 0;
    
    // -------------------------------------------------------------------------
    // Método addReservation: Agrega una nueva reserva al arreglo.
    public static void addReservation(Reservation r) {
        // Se verifica que aún haya espacio en el arreglo.
        if (count < reservations.length) {
            reservations[count] = r;
            count++; // Incrementa el contador de reservas.
        }
    }
    
    // -------------------------------------------------------------------------
    // Método getReservations: Devuelve el arreglo de reservas.
    public static Reservation[] getReservations() {
        return reservations;
    }
    
    // -------------------------------------------------------------------------
    // Método liberarReserva: Libera (elimina) la reserva en el índice especificado.
    // Si el índice es válido, se mueve cada reserva siguiente para "llenar" el espacio eliminado.
    public static boolean liberarReserva(int index) {
        if (index >= 0 && index < count) {
            for (int i = index; i < count - 1; i++) {
                reservations[i] = reservations[i + 1];
            }
            // Se limpia la última posición y se decrementa el contador.
            reservations[count - 1] = null;
            count--;
            return true;
        }
        return false; // Retorna false si el índice no era válido.
    }
}

// -----------------------------------------------------------------------------
// Clase Reservation: Representa una reserva de un empleado.
// Se almacena el ID del empleado, su nombre, el tipo de reserva y un detalle adicional.
class Reservation {
    int employeeID;
    String employeeName;
    String type;
    String detail;
    
    // Constructor para inicializar la reserva con los datos correspondientes.
    public Reservation(int employeeID, String employeeName, String type, String detail) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.type = type;
        this.detail = detail;
    }
    
    // -------------------------------------------------------------------------
    // Método toString: Devuelve una cadena que representa la reserva.
    // Se sobrescribe para facilitar la visualización de la información.
    @Override
    public String toString() {
        return "Empleado: " + employeeName + " (ID: " + employeeID + "), Tipo: " + type + ", Detalle: " + detail;
    }
}

// -----------------------------------------------------------------------------
// Clase ReservationsView: Ventana que muestra la lista de reservas existentes.
class ReservationsView extends JFrame {
    public ReservationsView() {
        setTitle("Listado de Reservas");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Se crea un área de texto que mostrará la lista de reservas.
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false); // El área de texto es solo de lectura.
        String list = "";
        // Se obtienen las reservas actuales.
        Reservation[] reservas = ReservationsManager.getReservations();
        // Se recorre el arreglo hasta el número actual de reservas (count).
        for (int i = 0; i < ReservationsManager.count; i++) {
            list += i + " -> " + reservas[i].toString() + "\n";
        }
        textArea.setText(list);
        // Se añade el área de texto a un JScrollPane para soportar listas largas.
        JScrollPane scroll = new JScrollPane(textArea);
        getContentPane().add(scroll);
        setVisible(true);
    }
}

// *****************************************************************************
// GESTIÓN DE EMPLEADOS

// -----------------------------------------------------------------------------
// Clase Employee: Representa un empleado con un ID y un nombre.
class Employee {
    int id;
    String name;
    
    // Constructor para inicializar un empleado.
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// -----------------------------------------------------------------------------
// Clase EmployeeCatalog: Catálogo de empleados precargado y gestionable.
// Almacena los empleados en un arreglo estático y permite buscar, agregar y listar empleados.
class EmployeeCatalog {
    // Arreglo estático para almacenar hasta 50 empleados.
    public static Employee[] employees = new Employee[50];
    // Contador que indica cuántos empleados han sido agregados.
    public static int count = 0;
    
    // Bloque estático: se ejecuta una sola vez cuando se carga la clase.
    // Aquí se precargan algunos empleados para tener datos iniciales.
    static {
        employees[0] = new Employee(1, "Juan Perez");
        employees[1] = new Employee(2, "Maria Lopez");
        employees[2] = new Employee(3, "Carlos Gomez");
        employees[3] = new Employee(4, "Ana Martinez");
        employees[4] = new Employee(5, "Luis Rodriguez");
        count = 5;
    }
    
    // -------------------------------------------------------------------------
    // Método getNameByID: Recibe un ID y busca en el arreglo el nombre del empleado.
    // Si no se encuentra, retorna una cadena vacía.
    public static String getNameByID(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].id == id)
                return employees[i].name;
        }
        return "";
    }
    
    // -------------------------------------------------------------------------
    // Método addEmployee: Agrega un nuevo empleado al catálogo.
    // Primero verifica que no exista otro empleado con el mismo ID.
    public static boolean addEmployee(Employee e) {
        if (!getNameByID(e.id).equals("")) {
            // Si ya existe, retorna false.
            return false;
        }
        // Se verifica que haya espacio en el arreglo.
        if (count < employees.length) {
            employees[count] = e;
            count++;
            return true;
        }
        return false;
    }
    
    // -------------------------------------------------------------------------
    // Método listEmployees: Crea y retorna una cadena con la lista de empleados.
    public static String listEmployees() {
        String list = "";
        for (int i = 0; i < count; i++) {
            list += "ID: " + employees[i].id + " - Nombre: " + employees[i].name + "\n";
        }
        return list;
    }
}

// -----------------------------------------------------------------------------
// Clase EmployeeManagementView: Ventana para gestionar empleados.
// Permite listar los empleados y registrar nuevos mediante diálogos de entrada.
class EmployeeManagementView extends JFrame {
    // Declaración de botones para las acciones disponibles.
    private JButton btnListar, btnRegistrar, btnCerrar;
    
    public EmployeeManagementView() {
        setTitle("Gestión de Empleados");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Se crea un panel principal con BoxLayout vertical para organizar los botones.
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        // ---------------------------------------------------------------------
        // Botón para mostrar la lista de empleados.
        btnListar = new JButton("Mostrar Empleados");
        btnListar.setAlignmentX(CENTER_ALIGNMENT);
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // Muestra un diálogo con la lista de empleados utilizando el método listEmployees del catálogo.
                JOptionPane.showMessageDialog(null, EmployeeCatalog.listEmployees(),
                        "Listado de Empleados", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        panel.add(btnListar);
        panel.add(Box.createVerticalStrut(10));
        
        // ---------------------------------------------------------------------
        // Botón para registrar un nuevo empleado.
        btnRegistrar = new JButton("Registrar Empleado");
        btnRegistrar.setAlignmentX(CENTER_ALIGNMENT);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // Llama al método registrarEmpleado definido más abajo.
                registrarEmpleado();
            }
        });
        panel.add(btnRegistrar);
        panel.add(Box.createVerticalStrut(10));
        
        // ---------------------------------------------------------------------
        // Botón para cerrar la ventana de gestión de empleados.
        btnCerrar = new JButton("Cerrar");
        btnCerrar.setAlignmentX(CENTER_ALIGNMENT);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // dispose() cierra esta ventana.
                dispose();
            }
        });
        panel.add(btnCerrar);
        
        getContentPane().add(panel);
        setVisible(true);
    }
    
    // -------------------------------------------------------------------------
    // Método registrarEmpleado: Solicita datos al usuario para registrar un nuevo empleado.
    // Realiza validaciones y utiliza el EmployeeCatalog para agregar el empleado.
    private void registrarEmpleado() {
        try {
            // Se solicita el ID mediante un diálogo.
            String idStr = JOptionPane.showInputDialog(this, "Ingrese el ID del nuevo empleado:");
            if (idStr == null) return;
            int id = Integer.parseInt(idStr);
            // Se verifica que el ID no esté ya registrado.
            if (!EmployeeCatalog.getNameByID(id).equals("")) {
                JOptionPane.showMessageDialog(this, "El ID ya se encuentra registrado.");
                return;
            }
            // Se solicita el nombre del empleado.
            String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del empleado:");
            // Se valida que el nombre no sea nulo ni vacío.
            if (nombre == null || nombre.trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Nombre inválido.");
                return;
            }
            // Se intenta agregar el empleado al catálogo.
            boolean registrado = EmployeeCatalog.addEmployee(new Employee(id, nombre));
            if (registrado) {
                JOptionPane.showMessageDialog(this, "Empleado registrado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo registrar el empleado (límite alcanzado o error).");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error en el registro. Verifique los datos ingresados.");
        }
    }
}
