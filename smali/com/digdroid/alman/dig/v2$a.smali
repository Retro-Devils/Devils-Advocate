.class Lcom/digdroid/alman/dig/v2$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/RatingBar$OnRatingBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/v2;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/v2$b;

.field final synthetic b:Lcom/digdroid/alman/dig/v2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/v2;Lcom/digdroid/alman/dig/v2$b;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/v2$a;->b:Lcom/digdroid/alman/dig/v2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/v2$a;->a:Lcom/digdroid/alman/dig/v2$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRatingChanged(Landroid/widget/RatingBar;FZ)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/v2$a;->a:Lcom/digdroid/alman/dig/v2$b;

    iput p2, p1, Lcom/digdroid/alman/dig/v2$b;->a:F

    return-void
.end method
