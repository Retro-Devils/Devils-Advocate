.class Lcom/digdroid/alman/dig/o2$i$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/o2$i$b;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/o2$i$b;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/o2$i$b;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/o2$i$b$a;->b:Lcom/digdroid/alman/dig/o2$i$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/o2$i$b$a;->b:Lcom/digdroid/alman/dig/o2$i$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/o2$i$b;->a:Lcom/digdroid/alman/dig/o2$i;

    iget-object p1, p1, Lcom/digdroid/alman/dig/o2$i;->c:Lcom/digdroid/alman/dig/o2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/b3;->T(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/o2$i$b$a;->b:Lcom/digdroid/alman/dig/o2$i$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/o2$i$b;->a:Lcom/digdroid/alman/dig/o2$i;

    iget-object p1, p1, Lcom/digdroid/alman/dig/o2$i;->c:Lcom/digdroid/alman/dig/o2;

    invoke-static {p1}, Lcom/digdroid/alman/dig/z3;->t(Landroid/app/Activity;)V

    return-void
.end method
