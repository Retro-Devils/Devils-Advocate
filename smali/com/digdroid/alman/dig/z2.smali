.class Lcom/digdroid/alman/dig/z2;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/z2$b;
    }
.end annotation


# instance fields
.field a:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/z2;->a:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public a(Lcom/digdroid/alman/dig/z2$b;)V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/CharSequence;

    iget-object v1, p0, Lcom/digdroid/alman/dig/z2;->a:Landroid/app/Activity;

    const v2, 0x7f110294

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/digdroid/alman/dig/z2;->a:Landroid/app/Activity;

    const v2, 0x7f110238

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Landroidx/appcompat/app/b$a;

    iget-object v2, p0, Lcom/digdroid/alman/dig/z2;->a:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v2, 0x7f1100c6

    invoke-virtual {v1, v2}, Landroidx/appcompat/app/b$a;->r(I)Landroidx/appcompat/app/b$a;

    move-result-object v1

    new-instance v2, Lcom/digdroid/alman/dig/z2$a;

    invoke-direct {v2, p0, p1}, Lcom/digdroid/alman/dig/z2$a;-><init>(Lcom/digdroid/alman/dig/z2;Lcom/digdroid/alman/dig/z2$b;)V

    invoke-virtual {v1, v0, v2}, Landroidx/appcompat/app/b$a;->g([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method
