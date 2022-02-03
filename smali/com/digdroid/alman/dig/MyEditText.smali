.class final Lcom/digdroid/alman/dig/MyEditText;
.super Landroidx/appcompat/widget/k;
.source ""


# static fields
.field static e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/k;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/MyEditText;->a()V

    return-void
.end method

.method private a()V
    .locals 1

    new-instance v0, Lcom/digdroid/alman/dig/MyEditText$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/MyEditText$a;-><init>(Lcom/digdroid/alman/dig/MyEditText;)V

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    new-instance v0, Lcom/digdroid/alman/dig/MyEditText$b;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/MyEditText$b;-><init>(Lcom/digdroid/alman/dig/MyEditText;)V

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    return-void
.end method

.method public static b()Z
    .locals 2

    const-class v0, Lcom/digdroid/alman/dig/MyEditText;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lcom/digdroid/alman/dig/MyEditText;->e:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 4

    const-class v0, Lcom/digdroid/alman/dig/MyEditText;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    const/4 v3, 0x4

    if-eq v1, v3, :cond_1

    const/16 v3, 0x60

    if-eq v1, v3, :cond_0

    const/16 v2, 0x61

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_0
    sput-boolean v2, Lcom/digdroid/alman/dig/MyEditText;->e:Z

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    sput-boolean v1, Lcom/digdroid/alman/dig/MyEditText;->e:Z

    :cond_2
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-super {p0, p1}, Landroid/widget/EditText;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
