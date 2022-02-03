.class Lcom/digdroid/alman/dig/s$f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/s$f;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/r3;

.field final synthetic c:Lcom/digdroid/alman/dig/s$f;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/s$f;Lcom/digdroid/alman/dig/r3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/s$f$a;->c:Lcom/digdroid/alman/dig/s$f;

    iput-object p2, p0, Lcom/digdroid/alman/dig/s$f$a;->b:Lcom/digdroid/alman/dig/r3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$f$a;->b:Lcom/digdroid/alman/dig/r3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/r3;->u()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$f$a;->c:Lcom/digdroid/alman/dig/s$f;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s$f;->c:Lcom/digdroid/alman/dig/s;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/MainActivity;

    new-instance p2, Lcom/digdroid/alman/dig/s$f$a$a;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/s$f$a$a;-><init>(Lcom/digdroid/alman/dig/s$f$a;)V

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/p3;->j(Lcom/digdroid/alman/dig/a4;Lcom/digdroid/alman/dig/p3$e;)V

    return-void
.end method
