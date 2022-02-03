.class Lcom/digdroid/alman/dig/MyEditText$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/MyEditText;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/MyEditText;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/MyEditText;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/MyEditText$a;->a:Lcom/digdroid/alman/dig/MyEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 2

    const-class p1, Lcom/digdroid/alman/dig/MyEditText;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/MyEditText$a;->a:Lcom/digdroid/alman/dig/MyEditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-nez p2, :cond_0

    sput-boolean v1, Lcom/digdroid/alman/dig/MyEditText;->e:Z

    iget-object p2, p0, Lcom/digdroid/alman/dig/MyEditText$a;->a:Lcom/digdroid/alman/dig/MyEditText;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->m()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->setBackgroundColor(I)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/MyEditText$a;->a:Lcom/digdroid/alman/dig/MyEditText;

    const v0, -0xbbbbbc

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->setBackgroundColor(I)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/digdroid/alman/dig/MyEditText$a;->a:Lcom/digdroid/alman/dig/MyEditText;

    invoke-virtual {p2, v1}, Landroid/widget/EditText;->setBackgroundColor(I)V

    :goto_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
